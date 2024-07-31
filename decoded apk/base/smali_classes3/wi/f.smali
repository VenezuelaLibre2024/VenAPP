.class public final Lwi/f;
.super Lio/grpc/internal/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwi/f$f;,
        Lwi/f$d;,
        Lwi/f$e;,
        Lwi/f$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/grpc/internal/b<",
        "Lwi/f;",
        ">;"
    }
.end annotation


# static fields
.field private static final r:Ljava/util/logging/Logger;

.field static final s:Lio/grpc/okhttp/internal/b;

.field private static final t:J

.field private static final u:Lio/grpc/internal/e2$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/grpc/internal/e2$d<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field static final v:Lio/grpc/internal/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/grpc/internal/o1<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field private static final w:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lvi/m1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lio/grpc/internal/g1;

.field private c:Lio/grpc/internal/n2$b;

.field private d:Lio/grpc/internal/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/grpc/internal/o1<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lio/grpc/internal/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/grpc/internal/o1<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljavax/net/SocketFactory;

.field private g:Ljavax/net/ssl/SSLSocketFactory;

.field private final h:Z

.field private i:Ljavax/net/ssl/HostnameVerifier;

.field private j:Lio/grpc/okhttp/internal/b;

.field private k:Lwi/f$c;

.field private l:J

.field private m:J

.field private n:I

.field private o:Z

.field private p:I

.field private final q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const-class v0, Lwi/f;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lwi/f;->r:Ljava/util/logging/Logger;

    new-instance v0, Lio/grpc/okhttp/internal/b$b;

    sget-object v1, Lio/grpc/okhttp/internal/b;->f:Lio/grpc/okhttp/internal/b;

    invoke-direct {v0, v1}, Lio/grpc/okhttp/internal/b$b;-><init>(Lio/grpc/okhttp/internal/b;)V

    const/4 v1, 0x6

    new-array v1, v1, [Lio/grpc/okhttp/internal/a;

    sget-object v2, Lio/grpc/okhttp/internal/a;->TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256:Lio/grpc/okhttp/internal/a;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lio/grpc/okhttp/internal/a;->TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256:Lio/grpc/okhttp/internal/a;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const/4 v2, 0x2

    sget-object v5, Lio/grpc/okhttp/internal/a;->TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384:Lio/grpc/okhttp/internal/a;

    aput-object v5, v1, v2

    const/4 v2, 0x3

    sget-object v5, Lio/grpc/okhttp/internal/a;->TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384:Lio/grpc/okhttp/internal/a;

    aput-object v5, v1, v2

    const/4 v2, 0x4

    sget-object v5, Lio/grpc/okhttp/internal/a;->TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256:Lio/grpc/okhttp/internal/a;

    aput-object v5, v1, v2

    const/4 v2, 0x5

    sget-object v5, Lio/grpc/okhttp/internal/a;->TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256:Lio/grpc/okhttp/internal/a;

    aput-object v5, v1, v2

    invoke-virtual {v0, v1}, Lio/grpc/okhttp/internal/b$b;->f([Lio/grpc/okhttp/internal/a;)Lio/grpc/okhttp/internal/b$b;

    move-result-object v0

    new-array v1, v4, [Lio/grpc/okhttp/internal/k;

    sget-object v2, Lio/grpc/okhttp/internal/k;->TLS_1_2:Lio/grpc/okhttp/internal/k;

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lio/grpc/okhttp/internal/b$b;->i([Lio/grpc/okhttp/internal/k;)Lio/grpc/okhttp/internal/b$b;

    move-result-object v0

    invoke-virtual {v0, v4}, Lio/grpc/okhttp/internal/b$b;->h(Z)Lio/grpc/okhttp/internal/b$b;

    move-result-object v0

    invoke-virtual {v0}, Lio/grpc/okhttp/internal/b$b;->e()Lio/grpc/okhttp/internal/b;

    move-result-object v0

    sput-object v0, Lwi/f;->s:Lio/grpc/okhttp/internal/b;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Lwi/f;->t:J

    new-instance v0, Lwi/f$a;

    invoke-direct {v0}, Lwi/f$a;-><init>()V

    sput-object v0, Lwi/f;->u:Lio/grpc/internal/e2$d;

    invoke-static {v0}, Lio/grpc/internal/f2;->c(Lio/grpc/internal/e2$d;)Lio/grpc/internal/f2;

    move-result-object v0

    sput-object v0, Lwi/f;->v:Lio/grpc/internal/o1;

    sget-object v0, Lvi/m1;->MTLS:Lvi/m1;

    sget-object v1, Lvi/m1;->CUSTOM_MANAGERS:Lvi/m1;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Lwi/f;->w:Ljava/util/EnumSet;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 5

    invoke-direct {p0}, Lio/grpc/internal/b;-><init>()V

    invoke-static {}, Lio/grpc/internal/n2;->a()Lio/grpc/internal/n2$b;

    move-result-object v0

    iput-object v0, p0, Lwi/f;->c:Lio/grpc/internal/n2$b;

    sget-object v0, Lwi/f;->v:Lio/grpc/internal/o1;

    iput-object v0, p0, Lwi/f;->d:Lio/grpc/internal/o1;

    sget-object v0, Lio/grpc/internal/q0;->v:Lio/grpc/internal/e2$d;

    invoke-static {v0}, Lio/grpc/internal/f2;->c(Lio/grpc/internal/e2$d;)Lio/grpc/internal/f2;

    move-result-object v0

    iput-object v0, p0, Lwi/f;->e:Lio/grpc/internal/o1;

    sget-object v0, Lwi/f;->s:Lio/grpc/okhttp/internal/b;

    iput-object v0, p0, Lwi/f;->j:Lio/grpc/okhttp/internal/b;

    sget-object v0, Lwi/f$c;->TLS:Lwi/f$c;

    iput-object v0, p0, Lwi/f;->k:Lwi/f$c;

    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lwi/f;->l:J

    sget-wide v0, Lio/grpc/internal/q0;->n:J

    iput-wide v0, p0, Lwi/f;->m:J

    const v0, 0xffff

    iput v0, p0, Lwi/f;->n:I

    const v0, 0x7fffffff

    iput v0, p0, Lwi/f;->p:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lwi/f;->q:Z

    new-instance v1, Lio/grpc/internal/g1;

    new-instance v2, Lwi/f$e;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lwi/f$e;-><init>(Lwi/f;Lwi/f$a;)V

    new-instance v4, Lwi/f$d;

    invoke-direct {v4, p0, v3}, Lwi/f$d;-><init>(Lwi/f;Lwi/f$a;)V

    invoke-direct {v1, p1, v2, v4}, Lio/grpc/internal/g1;-><init>(Ljava/lang/String;Lio/grpc/internal/g1$c;Lio/grpc/internal/g1$b;)V

    iput-object v1, p0, Lwi/f;->b:Lio/grpc/internal/g1;

    iput-boolean v0, p0, Lwi/f;->h:Z

    return-void
.end method

.method public static f(Ljava/lang/String;)Lwi/f;
    .locals 1

    new-instance v0, Lwi/f;

    invoke-direct {v0, p0}, Lwi/f;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method protected c()Lvi/t0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvi/t0<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lwi/f;->b:Lio/grpc/internal/g1;

    return-object v0
.end method

.method d()Lwi/f$f;
    .locals 22

    move-object/from16 v0, p0

    iget-wide v1, v0, Lwi/f;->l:J

    const-wide v3, 0x7fffffffffffffffL

    cmp-long v1, v1, v3

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move v10, v1

    new-instance v1, Lwi/f$f;

    move-object v2, v1

    iget-object v3, v0, Lwi/f;->d:Lio/grpc/internal/o1;

    iget-object v4, v0, Lwi/f;->e:Lio/grpc/internal/o1;

    iget-object v5, v0, Lwi/f;->f:Ljavax/net/SocketFactory;

    invoke-virtual/range {p0 .. p0}, Lwi/f;->e()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v6

    iget-object v7, v0, Lwi/f;->i:Ljavax/net/ssl/HostnameVerifier;

    iget-object v8, v0, Lwi/f;->j:Lio/grpc/okhttp/internal/b;

    iget v9, v0, Lio/grpc/internal/b;->a:I

    iget-wide v11, v0, Lwi/f;->l:J

    iget-wide v13, v0, Lwi/f;->m:J

    iget v15, v0, Lwi/f;->n:I

    move-object/from16 v21, v1

    iget-boolean v1, v0, Lwi/f;->o:Z

    move/from16 v16, v1

    iget v1, v0, Lwi/f;->p:I

    move/from16 v17, v1

    iget-object v1, v0, Lwi/f;->c:Lio/grpc/internal/n2$b;

    move-object/from16 v18, v1

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v2 .. v20}, Lwi/f$f;-><init>(Lio/grpc/internal/o1;Lio/grpc/internal/o1;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lio/grpc/okhttp/internal/b;IZJJIZILio/grpc/internal/n2$b;ZLwi/f$a;)V

    return-object v21
.end method

.method e()Ljavax/net/ssl/SSLSocketFactory;
    .locals 3

    sget-object v0, Lwi/f$b;->b:[I

    iget-object v1, p0, Lwi/f;->k:Lwi/f$c;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    :try_start_0
    iget-object v0, p0, Lwi/f;->g:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v0, :cond_0

    const-string v0, "Default"

    invoke-static {}, Lio/grpc/okhttp/internal/h;->e()Lio/grpc/okhttp/internal/h;

    move-result-object v1

    invoke-virtual {v1}, Lio/grpc/okhttp/internal/h;->g()Ljava/security/Provider;

    move-result-object v1

    invoke-static {v0, v1}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/net/ssl/SSLContext;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Lwi/f;->g:Ljavax/net/ssl/SSLSocketFactory;

    :cond_0
    iget-object v0, p0, Lwi/f;->g:Ljavax/net/ssl/SSLSocketFactory;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "TLS Provider failure"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown negotiation type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lwi/f;->k:Lwi/f$c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method g()I
    .locals 3

    sget-object v0, Lwi/f$b;->b:[I

    iget-object v1, p0, Lwi/f;->k:Lwi/f$c;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/16 v0, 0x1bb

    return v0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lwi/f;->k:Lwi/f$c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not handled"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    const/16 v0, 0x50

    return v0
.end method
