.class final Lvl/f$c;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvl/f;->i(Lvl/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/a<",
        "Ljava/util/List<",
        "+",
        "Ljava/security/cert/Certificate;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lql/g;

.field final synthetic b:Lql/s;

.field final synthetic c:Lql/a;


# direct methods
.method constructor <init>(Lql/g;Lql/s;Lql/a;)V
    .locals 0

    iput-object p1, p0, Lvl/f$c;->a:Lql/g;

    iput-object p2, p0, Lvl/f$c;->b:Lql/s;

    iput-object p3, p0, Lvl/f$c;->c:Lql/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/security/cert/Certificate;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lvl/f$c;->a:Lql/g;

    invoke-virtual {v0}, Lql/g;->d()Lcm/c;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object v1, p0, Lvl/f$c;->b:Lql/s;

    invoke-virtual {v1}, Lql/s;->d()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lvl/f$c;->c:Lql/a;

    invoke-virtual {v2}, Lql/a;->l()Lql/u;

    move-result-object v2

    invoke-virtual {v2}, Lql/u;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcm/c;->a(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lvl/f$c;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
