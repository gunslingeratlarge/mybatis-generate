package cn.kvmial.mybatisgenerate.pojo;

public class VoteTotal {
    private Integer id;

    private String inst_id;

    private String proposal;

    private String investor_account_id;

    private String preference;

    private Integer amount;

    private String investor_name;

    private String multiple_card;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInst_id() {
        return inst_id;
    }

    public void setInst_id(String inst_id) {
        this.inst_id = inst_id == null ? null : inst_id.trim();
    }

    public String getProposal() {
        return proposal;
    }

    public void setProposal(String proposal) {
        this.proposal = proposal == null ? null : proposal.trim();
    }

    public String getInvestor_account_id() {
        return investor_account_id;
    }

    public void setInvestor_account_id(String investor_account_id) {
        this.investor_account_id = investor_account_id == null ? null : investor_account_id.trim();
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference == null ? null : preference.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getInvestor_name() {
        return investor_name;
    }

    public void setInvestor_name(String investor_name) {
        this.investor_name = investor_name == null ? null : investor_name.trim();
    }

    public String getMultiple_card() {
        return multiple_card;
    }

    public void setMultiple_card(String multiple_card) {
        this.multiple_card = multiple_card == null ? null : multiple_card.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}