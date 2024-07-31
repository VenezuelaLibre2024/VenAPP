.class final Lr1/d$b$b;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr1/d$b;->f(Lok/l;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/l<",
        "Lv1/i;",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lr1/d$b;

.field final synthetic b:Lok/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/l<",
            "Lv1/m;",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lr1/d$b;Lok/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr1/d$b;",
            "Lok/l<",
            "-",
            "Lv1/m;",
            "+TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lr1/d$b$b;->a:Lr1/d$b;

    iput-object p2, p0, Lr1/d$b$b;->b:Lok/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lv1/i;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv1/i;",
            ")TT;"
        }
    .end annotation

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lr1/d$b$b;->a:Lr1/d$b;

    invoke-static {v0}, Lr1/d$b;->b(Lr1/d$b;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lv1/i;->C0(Ljava/lang/String;)Lv1/m;

    move-result-object p1

    iget-object v0, p0, Lr1/d$b$b;->a:Lr1/d$b;

    invoke-static {v0, p1}, Lr1/d$b;->a(Lr1/d$b;Lv1/m;)V

    iget-object v0, p0, Lr1/d$b$b;->b:Lok/l;

    invoke-interface {v0, p1}, Lok/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv1/i;

    invoke-virtual {p0, p1}, Lr1/d$b$b;->a(Lv1/i;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
