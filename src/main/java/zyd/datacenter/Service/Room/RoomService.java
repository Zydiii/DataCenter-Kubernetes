package zyd.datacenter.Service.Room;

import zyd.datacenter.Entities.Room.Room;
import zyd.datacenter.Entities.User.Spectator;
import zyd.datacenter.Entities.User.User;
import zyd.datacenter.Entities.User.UserInRoom;
import zyd.datacenter.Payload.Result;

import java.util.List;

public interface RoomService {
    public List<Room> getAllRoom();

    public Result createRoom(Room room);

    public Result deleteRoom(Room questRoom);

    public Result updateRoom(Room questRoom);

    public Result joinRoom(UserInRoom userInRoom);

    public Result leaveRoom(UserInRoom userInRoom);

    public Result match(UserInRoom userInRoom);

    public Result joinWatchRoom(Spectator spectator);

}
