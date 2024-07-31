.class Lvi/y0$a;
.super Lvi/y0$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvi/y0;->e(Lvi/y0$f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lvi/y0$f;

.field final synthetic b:Lvi/y0;


# direct methods
.method constructor <init>(Lvi/y0;Lvi/y0$f;)V
    .locals 0

    iput-object p1, p0, Lvi/y0$a;->b:Lvi/y0;

    iput-object p2, p0, Lvi/y0$a;->a:Lvi/y0$f;

    invoke-direct {p0}, Lvi/y0$e;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lvi/g1;)V
    .locals 1

    iget-object v0, p0, Lvi/y0$a;->a:Lvi/y0$f;

    invoke-interface {v0, p1}, Lvi/y0$f;->b(Lvi/g1;)V

    return-void
.end method

.method public c(Lvi/y0$g;)V
    .locals 2

    iget-object v0, p0, Lvi/y0$a;->a:Lvi/y0$f;

    invoke-virtual {p1}, Lvi/y0$g;->a()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lvi/y0$g;->b()Lvi/a;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lvi/y0$f;->a(Ljava/util/List;Lvi/a;)V

    return-void
.end method
