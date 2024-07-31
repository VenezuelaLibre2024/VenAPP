.class Lk2/p$a;
.super Lr1/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk2/p;-><init>(Lr1/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lr1/i<",
        "Lk2/n;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic d:Lk2/p;


# direct methods
.method constructor <init>(Lk2/p;Lr1/u;)V
    .locals 0

    iput-object p1, p0, Lk2/p$a;->d:Lk2/p;

    invoke-direct {p0, p2}, Lr1/i;-><init>(Lr1/u;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)"

    return-object v0
.end method

.method public bridge synthetic i(Lv1/m;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lk2/n;

    invoke-virtual {p0, p1, p2}, Lk2/p$a;->k(Lv1/m;Lk2/n;)V

    return-void
.end method

.method public k(Lv1/m;Lk2/n;)V
    .locals 2

    invoke-virtual {p2}, Lk2/n;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lv1/k;->g1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lk2/n;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lv1/k;->x0(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lk2/n;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Lv1/k;->g1(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lk2/n;->b()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Lv1/k;->x0(ILjava/lang/String;)V

    :goto_1
    return-void
.end method
