.class public final Lvi/p0$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvi/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvi/p0$g$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lvi/x;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lvi/a;

.field private final c:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Ljava/util/List;Lvi/a;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lvi/x;",
            ">;",
            "Lvi/a;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const-string v1, "addresses"

    invoke-static {p1, v1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lvi/p0$g;->a:Ljava/util/List;

    const-string p1, "attributes"

    invoke-static {p2, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/a;

    iput-object p1, p0, Lvi/p0$g;->b:Lvi/a;

    iput-object p3, p0, Lvi/p0$g;->c:Ljava/lang/Object;

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/List;Lvi/a;Ljava/lang/Object;Lvi/p0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lvi/p0$g;-><init>(Ljava/util/List;Lvi/a;Ljava/lang/Object;)V

    return-void
.end method

.method public static d()Lvi/p0$g$a;
    .locals 1

    new-instance v0, Lvi/p0$g$a;

    invoke-direct {v0}, Lvi/p0$g$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lvi/x;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lvi/p0$g;->a:Ljava/util/List;

    return-object v0
.end method

.method public b()Lvi/a;
    .locals 1

    iget-object v0, p0, Lvi/p0$g;->b:Lvi/a;

    return-object v0
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lvi/p0$g;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public e()Lvi/p0$g$a;
    .locals 2

    invoke-static {}, Lvi/p0$g;->d()Lvi/p0$g$a;

    move-result-object v0

    iget-object v1, p0, Lvi/p0$g;->a:Ljava/util/List;

    invoke-virtual {v0, v1}, Lvi/p0$g$a;->b(Ljava/util/List;)Lvi/p0$g$a;

    move-result-object v0

    iget-object v1, p0, Lvi/p0$g;->b:Lvi/a;

    invoke-virtual {v0, v1}, Lvi/p0$g$a;->c(Lvi/a;)Lvi/p0$g$a;

    move-result-object v0

    iget-object v1, p0, Lvi/p0$g;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lvi/p0$g$a;->d(Ljava/lang/Object;)Lvi/p0$g$a;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lvi/p0$g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lvi/p0$g;

    iget-object v0, p0, Lvi/p0$g;->a:Ljava/util/List;

    iget-object v2, p1, Lvi/p0$g;->a:Ljava/util/List;

    invoke-static {v0, v2}, Leb/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lvi/p0$g;->b:Lvi/a;

    iget-object v2, p1, Lvi/p0$g;->b:Lvi/a;

    invoke-static {v0, v2}, Leb/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lvi/p0$g;->c:Ljava/lang/Object;

    iget-object p1, p1, Lvi/p0$g;->c:Ljava/lang/Object;

    invoke-static {v0, p1}, Leb/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lvi/p0$g;->a:Ljava/util/List;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lvi/p0$g;->b:Lvi/a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lvi/p0$g;->c:Ljava/lang/Object;

    aput-object v2, v0, v1

    invoke-static {v0}, Leb/k;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Leb/i;->c(Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "addresses"

    iget-object v2, p0, Lvi/p0$g;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "attributes"

    iget-object v2, p0, Lvi/p0$g;->b:Lvi/a;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "loadBalancingPolicyConfig"

    iget-object v2, p0, Lvi/p0$g;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
