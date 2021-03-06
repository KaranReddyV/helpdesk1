/*package com.ojas.ticket.dao.blogpost;

import org.springframework.transaction.annotation.Transactional;

import com.ojas.ticket.dao.JpaDao;
import com.ojas.ticket.entity.BlogPost;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


public class JpaBlogPostDao extends JpaDao<BlogPost, Long> implements BlogPostDao
{
    public JpaBlogPostDao()
    {
        super(BlogPost.class);
    }

    @Override
    @Transactional(readOnly = true)
    public List<BlogPost> findAll()
    {
        final CriteriaBuilder builder = this.getEntityManager().getCriteriaBuilder();
        final CriteriaQuery<BlogPost> criteriaQuery = builder.createQuery(BlogPost.class);

        Root<BlogPost> root = criteriaQuery.from(BlogPost.class);
        criteriaQuery.orderBy(builder.desc(root.get("date")));

        TypedQuery<BlogPost> typedQuery = this.getEntityManager().createQuery(criteriaQuery);
        return typedQuery.getResultList();
    }
}
*/