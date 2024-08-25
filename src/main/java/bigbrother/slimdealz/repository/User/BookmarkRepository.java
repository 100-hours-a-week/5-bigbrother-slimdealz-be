package bigbrother.slimdealz.repository.User;

import bigbrother.slimdealz.entity.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface BookmarkRepository extends JpaRepository<Bookmark, Long>, QuerydslPredicateExecutor<Bookmark>, BookmarkRepositoryCustom {
    List<Bookmark> findByMemberId(Long memberId);
    Optional<Bookmark> findByIdAndMemberId(Long id, Long memberId);
}
