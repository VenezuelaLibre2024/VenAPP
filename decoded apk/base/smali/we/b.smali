.class final Lwe/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Lre/a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lee/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lee/b<",
            "Lf6/g;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lf6/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/f<",
            "Lxe/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lre/a;->e()Lre/a;

    move-result-object v0

    sput-object v0, Lwe/b;->d:Lre/a;

    return-void
.end method

.method constructor <init>(Lee/b;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lee/b<",
            "Lf6/g;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lwe/b;->a:Ljava/lang/String;

    iput-object p1, p0, Lwe/b;->b:Lee/b;

    return-void
.end method

.method private a()Z
    .locals 5

    iget-object v0, p0, Lwe/b;->c:Lf6/f;

    if-nez v0, :cond_1

    iget-object v0, p0, Lwe/b;->b:Lee/b;

    invoke-interface {v0}, Lee/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf6/g;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lwe/b;->a:Ljava/lang/String;

    const-string v2, "proto"

    invoke-static {v2}, Lf6/b;->b(Ljava/lang/String;)Lf6/b;

    move-result-object v2

    new-instance v3, Lwe/a;

    invoke-direct {v3}, Lwe/a;-><init>()V

    const-class v4, Lxe/i;

    invoke-interface {v0, v1, v4, v2, v3}, Lf6/g;->b(Ljava/lang/String;Ljava/lang/Class;Lf6/b;Lf6/e;)Lf6/f;

    move-result-object v0

    iput-object v0, p0, Lwe/b;->c:Lf6/f;

    goto :goto_0

    :cond_0
    sget-object v0, Lwe/b;->d:Lre/a;

    const-string v1, "Flg TransportFactory is not available at the moment"

    invoke-virtual {v0, v1}, Lre/a;->j(Ljava/lang/String;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lwe/b;->c:Lf6/f;

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0
.end method


# virtual methods
.method public b(Lxe/i;)V
    .locals 1

    invoke-direct {p0}, Lwe/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lwe/b;->d:Lre/a;

    const-string v0, "Unable to dispatch event because Flg Transport is not available"

    invoke-virtual {p1, v0}, Lre/a;->j(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lwe/b;->c:Lf6/f;

    invoke-static {p1}, Lf6/c;->d(Ljava/lang/Object;)Lf6/c;

    move-result-object p1

    invoke-interface {v0, p1}, Lf6/f;->b(Lf6/c;)V

    return-void
.end method
