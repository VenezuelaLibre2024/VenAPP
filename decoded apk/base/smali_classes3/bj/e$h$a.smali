.class Lbj/e$h$a;
.super Lvi/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbj/e$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:Lbj/e$b;

.field final synthetic b:Lbj/e$h;


# direct methods
.method public constructor <init>(Lbj/e$h;Lbj/e$b;)V
    .locals 0

    iput-object p1, p0, Lbj/e$h$a;->b:Lbj/e$h;

    invoke-direct {p0}, Lvi/k;-><init>()V

    iput-object p2, p0, Lbj/e$h$a;->a:Lbj/e$b;

    return-void
.end method


# virtual methods
.method public i(Lvi/g1;)V
    .locals 1

    iget-object v0, p0, Lbj/e$h$a;->a:Lbj/e$b;

    invoke-virtual {p1}, Lvi/g1;->p()Z

    move-result p1

    invoke-virtual {v0, p1}, Lbj/e$b;->g(Z)V

    return-void
.end method
