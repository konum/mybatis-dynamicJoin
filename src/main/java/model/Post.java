package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import dynamicJoin.JoinableField;

public class Post implements Serializable {
	
	@JoinableField(ownColumn="id",foreignColumn="idPost")
	private List<Reply> replies;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column POST.ID
     *
     * @mbggenerated
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column POST.IDAUTHOR
     *
     * @mbggenerated
     */
    private BigDecimal idauthor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column POST.POST
     *
     * @mbggenerated
     */
    private String post;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table POST
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column POST.ID
     *
     * @return the value of POST.ID
     *
     * @mbggenerated
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column POST.ID
     *
     * @param id the value for POST.ID
     *
     * @mbggenerated
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column POST.IDAUTHOR
     *
     * @return the value of POST.IDAUTHOR
     *
     * @mbggenerated
     */
    public BigDecimal getIdauthor() {
        return idauthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column POST.IDAUTHOR
     *
     * @param idauthor the value for POST.IDAUTHOR
     *
     * @mbggenerated
     */
    public void setIdauthor(BigDecimal idauthor) {
        this.idauthor = idauthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column POST.POST
     *
     * @return the value of POST.POST
     *
     * @mbggenerated
     */
    public String getPost() {
        return post;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column POST.POST
     *
     * @param post the value for POST.POST
     *
     * @mbggenerated
     */
    public void setPost(String post) {
        this.post = post;
    }

	public List<Reply> getReplies() {
		return replies;
	}

	public void setReplies(List<Reply> replies) {
		this.replies = replies;
	}
}