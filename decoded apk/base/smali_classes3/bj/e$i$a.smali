.class Lbj/e$i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvi/p0$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbj/e$i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field private final a:Lvi/p0$j;

.field final synthetic b:Lbj/e$i;


# direct methods
.method constructor <init>(Lbj/e$i;Lvi/p0$j;)V
    .locals 0

    iput-object p1, p0, Lbj/e$i$a;->b:Lbj/e$i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lbj/e$i$a;->a:Lvi/p0$j;

    return-void
.end method


# virtual methods
.method public a(Lvi/q;)V
    .locals 1

    iget-object v0, p0, Lbj/e$i$a;->b:Lbj/e$i;

    invoke-static {v0, p1}, Lbj/e$i;->j(Lbj/e$i;Lvi/q;)Lvi/q;

    iget-object v0, p0, Lbj/e$i$a;->b:Lbj/e$i;

    invoke-static {v0}, Lbj/e$i;->k(Lbj/e$i;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lbj/e$i$a;->a:Lvi/p0$j;

    invoke-interface {v0, p1}, Lvi/p0$j;->a(Lvi/q;)V

    :cond_0
    return-void
.end method
