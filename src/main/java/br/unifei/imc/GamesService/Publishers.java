package br.unifei.imc.GamesService;

public enum Publishers {
    Nintendo("Nintendo"),
    Activision("Activision"),
    Ubisoft("Ubisoft"),
    Sega("Sega"),
    SquareSoft("SquareSoft"),
    Atari("Atari"),
    BethesdaSoftworks("Bethesda Softworks"),
    ElectronicArts("Electronic Arts"),
    MicrosoftGameStudios("Microsoft Game Studios"),
    TakeTwo("Take-Two Interactive"),
    Sony("Sony Computer Entertainment");
    private final String text;

    Publishers(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
