.class Lbj/e$h$b;
.super Lvi/k$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbj/e$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private final a:Lbj/e$b;

.field final synthetic b:Lbj/e$h;


# direct methods
.method constructor <init>(Lbj/e$h;Lbj/e$b;)V
    .locals 0

    iput-object p1, p0, Lbj/e$h$b;->b:Lbj/e$h;

    invoke-direct {p0}, Lvi/k$a;-><init>()V

    iput-object p2, p0, Lbj/e$h$b;->a:Lbj/e$b;

    return-void
.end method


# virtual methods
.method public a(Lvi/k$b;Lvi/w0;)Lvi/k;
    .locals 1

    new-instance p1, Lbj/e$h$a;

    iget-object p2, p0, Lbj/e$h$b;->b:Lbj/e$h;

    iget-object v0, p0, Lbj/e$h$b;->a:Lbj/e$b;

    invoke-direct {p1, p2, v0}, Lbj/e$h$a;-><init>(Lbj/e$h;Lbj/e$b;)V

    return-object p1
.end method
