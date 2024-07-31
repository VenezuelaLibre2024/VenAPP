.class public final synthetic Lo6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lo6/r;

.field public final synthetic b:Lh6/p;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lo6/r;Lh6/p;ILjava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/g;->a:Lo6/r;

    iput-object p2, p0, Lo6/g;->b:Lh6/p;

    iput p3, p0, Lo6/g;->c:I

    iput-object p4, p0, Lo6/g;->d:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lo6/g;->a:Lo6/r;

    iget-object v1, p0, Lo6/g;->b:Lh6/p;

    iget v2, p0, Lo6/g;->c:I

    iget-object v3, p0, Lo6/g;->d:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2, v3}, Lo6/r;->a(Lo6/r;Lh6/p;ILjava/lang/Runnable;)V

    return-void
.end method
