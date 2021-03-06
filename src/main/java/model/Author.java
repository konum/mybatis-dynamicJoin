package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import dynamicJoin.JoinableField;

public class Author implements Serializable {
	
	@JoinableField(ownColumn="id",foreignColumn="idAuthor")
	private List<Post> posts;
	
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AUTHOR.ID
     *
     * @mbggenerated
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AUTHOR.NAME
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AUTHOR
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AUTHOR.ID
     *
     * @return the value of AUTHOR.ID
     *
     * @mbggenerated
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AUTHOR.ID
     *
     * @param id the value for AUTHOR.ID
     *
     * @mbggenerated
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AUTHOR.NAME
     *
     * @return the value of AUTHOR.NAME
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AUTHOR.NAME
     *
     * @param name the value for AUTHOR.NAME
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
}