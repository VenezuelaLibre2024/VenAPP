.class public final Lcom/google/crypto/tink/internal/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/crypto/tink/internal/r$c;,
        Lcom/google/crypto/tink/internal/r$d;,
        Lcom/google/crypto/tink/internal/r$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/google/crypto/tink/internal/r$d;",
            "Lcom/google/crypto/tink/internal/c<",
            "**>;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/google/crypto/tink/internal/r$c;",
            "Lcom/google/crypto/tink/internal/b<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/google/crypto/tink/internal/r$d;",
            "Lcom/google/crypto/tink/internal/k<",
            "**>;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/google/crypto/tink/internal/r$c;",
            "Lcom/google/crypto/tink/internal/j<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/crypto/tink/internal/r$b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/r$b;->b(Lcom/google/crypto/tink/internal/r$b;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/google/crypto/tink/internal/r;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/r$b;->c(Lcom/google/crypto/tink/internal/r$b;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/google/crypto/tink/internal/r;->b:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/r$b;->d(Lcom/google/crypto/tink/internal/r$b;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/google/crypto/tink/internal/r;->c:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/r$b;->a(Lcom/google/crypto/tink/internal/r$b;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/google/crypto/tink/internal/r;->d:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/crypto/tink/internal/r$b;Lcom/google/crypto/tink/internal/r$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/crypto/tink/internal/r;-><init>(Lcom/google/crypto/tink/internal/r$b;)V

    return-void
.end method

.method static synthetic a(Lcom/google/crypto/tink/internal/r;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/google/crypto/tink/internal/r;->a:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic b(Lcom/google/crypto/tink/internal/r;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/google/crypto/tink/internal/r;->b:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic c(Lcom/google/crypto/tink/internal/r;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/google/crypto/tink/internal/r;->c:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic d(Lcom/google/crypto/tink/internal/r;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/google/crypto/tink/internal/r;->d:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public e(Lcom/google/crypto/tink/internal/q;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lcom/google/crypto/tink/internal/q;",
            ">(TSerializationT;)Z"
        }
    .end annotation

    new-instance v0, Lcom/google/crypto/tink/internal/r$c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {p1}, Lcom/google/crypto/tink/internal/q;->a()Lxb/a;

    move-result-object p1

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Lcom/google/crypto/tink/internal/r$c;-><init>(Ljava/lang/Class;Lxb/a;Lcom/google/crypto/tink/internal/r$a;)V

    iget-object p1, p0, Lcom/google/crypto/tink/internal/r;->b:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(Lcom/google/crypto/tink/internal/q;Ljb/y;)Ljb/g;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lcom/google/crypto/tink/internal/q;",
            ">(TSerializationT;",
            "Ljb/y;",
            ")",
            "Ljb/g;"
        }
    .end annotation

    new-instance v0, Lcom/google/crypto/tink/internal/r$c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {p1}, Lcom/google/crypto/tink/internal/q;->a()Lxb/a;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/crypto/tink/internal/r$c;-><init>(Ljava/lang/Class;Lxb/a;Lcom/google/crypto/tink/internal/r$a;)V

    iget-object v1, p0, Lcom/google/crypto/tink/internal/r;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/crypto/tink/internal/r;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/internal/b;

    invoke-virtual {v0, p1, p2}, Lcom/google/crypto/tink/internal/b;->d(Lcom/google/crypto/tink/internal/q;Ljb/y;)Ljb/g;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No Key Parser for requested key type "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " available"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
