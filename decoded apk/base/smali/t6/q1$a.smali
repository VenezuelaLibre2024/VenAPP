.class Lt6/q1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/q3$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt6/q1;->q(IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lt6/q1;


# direct methods
.method constructor <init>(Lt6/q1;)V
    .locals 0

    iput-object p1, p0, Lt6/q1$a;->a:Lt6/q1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lt6/q1$a;->a:Lt6/q1;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lt6/q1;->g(Lt6/q1;Z)Z

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lt6/q1$a;->a:Lt6/q1;

    invoke-static {v0}, Lt6/q1;->j(Lt6/q1;)Lt8/o;

    move-result-object v0

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lt8/o;->i(I)Z

    return-void
.end method
