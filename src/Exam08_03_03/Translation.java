package Exam08_03_03;

class Translation {
    String[] months = { "–rŒ", "”@Œ", "–í¶", "‰KŒ", "HŒ", "…–³Œ", "•¶Œ",
                        "—tŒ", "’·Œ", "_–³Œ", "‘šŒ", "t‘–" };

    void jpLocalize(int index) {
        if (index > 12 || index < 1) {
            System.out.println("1~12‚ÌŒ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
            System.exit(1);
        }
        System.out.println(months[index - 1]);
    }
}
