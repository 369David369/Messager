package me.david.messagecore.account;

public enum AccountStatus {

    ONLINE(0),
    IDLE(1),
    NOTDISTURB(2),
    INVISIBLE(3);

    private final int id;

    AccountStatus(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static AccountStatus fromId(int id){
        for(AccountStatus status : values())
            if(status.getId() == id)
                return status;
        return AccountStatus.ONLINE;
    }
}