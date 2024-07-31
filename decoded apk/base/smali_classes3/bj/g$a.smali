.class Lbj/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvi/p0$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbj/g;->a(Lvi/p0$g;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lvi/p0$h;

.field final synthetic b:Lbj/g;


# direct methods
.method constructor <init>(Lbj/g;Lvi/p0$h;)V
    .locals 0

    iput-object p1, p0, Lbj/g$a;->b:Lbj/g;

    iput-object p2, p0, Lbj/g$a;->a:Lvi/p0$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lvi/q;)V
    .locals 2

    iget-object v0, p0, Lbj/g$a;->b:Lbj/g;

    iget-object v1, p0, Lbj/g$a;->a:Lvi/p0$h;

    invoke-static {v0, v1, p1}, Lbj/g;->f(Lbj/g;Lvi/p0$h;Lvi/q;)V

    return-void
.end method
