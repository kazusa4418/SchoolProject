package Exam08_03_03;

class Translation {
    private String[] months = { "–rŒ", "”@Œ", "–í¶", "‰KŒ", "HŒ", "…–³Œ", "•¶Œ",
                        "—tŒ", "’·Œ", "_–³Œ", "‘šŒ", "t‘–" };

    void jpLocalize(int index) {
        if (index > 0 && index < 13)
            System.out.println(months[index - 1]);
        else
            System.out.println("1~12‚Ü‚Å‚Ì’l‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
    }
}
