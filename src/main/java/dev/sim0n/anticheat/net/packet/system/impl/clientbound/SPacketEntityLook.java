package dev.sim0n.anticheat.net.packet.system.impl.clientbound;

import net.minecraft.server.v1_8_R3.PacketDataSerializer;

public class SPacketEntityLook extends SPacketEntity {

    @Override
    public void handle(PacketDataSerializer serializer) {
        super.handle(serializer);

        yaw = serializer.readByte();
        pitch = serializer.readByte();
    }
}