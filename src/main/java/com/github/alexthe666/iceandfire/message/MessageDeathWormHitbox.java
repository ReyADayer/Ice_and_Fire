package com.github.alexthe666.iceandfire.message;

import com.github.alexthe666.iceandfire.entity.EntityDeathWorm;
import io.netty.buffer.ByteBuf;
import net.ilexiconn.llibrary.server.network.AbstractMessage;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MessageDeathWormHitbox extends AbstractMessage<MessageDeathWormHitbox> {

    public int deathWormId;
    public float scale;

    public MessageDeathWormHitbox(int deathWormId, float scale) {
        this.deathWormId = deathWormId;
        this.scale = scale;
    }

    public MessageDeathWormHitbox() {
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        deathWormId = buf.readInt();
        scale = buf.readFloat();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(deathWormId);
        buf.writeFloat(scale);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void onClientReceived(Minecraft client, MessageDeathWormHitbox message, PlayerEntity player, MessageContext messageContext) {
        if (player.world != null) {
            Entity entity = player.world.getEntityByID(message.deathWormId);
            if (entity != null && entity instanceof EntityDeathWorm) {
                EntityDeathWorm worm = (EntityDeathWorm) entity;
                worm.initSegments(message.scale);
            }
        }

    }

    @Override
    public void onServerReceived(MinecraftServer server, MessageDeathWormHitbox message, PlayerEntity player, MessageContext messageContext) {
        if (player.world != null) {
            Entity entity = player.world.getEntityByID(message.deathWormId);
            if (entity != null && entity instanceof EntityDeathWorm) {
                EntityDeathWorm worm = (EntityDeathWorm) entity;
                worm.initSegments(message.scale);
            }
        }
    }
}