package online.simplefoodsolutions.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "apikey")
public class APIKey
{
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "api_key")
    private String hashedAPIKey;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getHashedAPIKey()
    {
        return hashedAPIKey;
    }

    public void setHashedAPIKey(String hashedAPIKey)
    {
        this.hashedAPIKey = hashedAPIKey;
    }
}
