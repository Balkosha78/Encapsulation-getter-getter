public class Gamer {
    private String nickname;
    private boolean isActiv;

    public Gamer(String nickname, boolean isActiv) {
        this.nickname = nickname;
        this.isActiv = isActiv;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public boolean getIsActiv() {
        if (isActiv == false) {
            System.out.println("Игрок не играет");
        } else {
             System.out.println("Игрок  играет");
            }
        return true;
    }

    public void setActiv(boolean activ) {
        isActiv = activ;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "nickname='" + nickname + '\'' +
                ", isActiv=" + isActiv +
                '}';
    }
}
