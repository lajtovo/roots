package pl.lajtovo.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import pl.lajtovo.domain.Authority;

/**
 * Spring Data R2DBC repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends R2dbcRepository<Authority, String> {}
