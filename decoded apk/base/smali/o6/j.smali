.class public final synthetic Lo6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/b$a;


# instance fields
.field public final synthetic a:Lo6/r;

.field public final synthetic b:Lh6/p;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lo6/r;Lh6/p;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/j;->a:Lo6/r;

    iput-object p2, p0, Lo6/j;->b:Lh6/p;

    iput p3, p0, Lo6/j;->c:I

    return-void
.end method


# virtual methods
.method public final n()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lo6/j;->a:Lo6/r;

    iget-object v1, p0, Lo6/j;->b:Lh6/p;

    iget v2, p0, Lo6/j;->c:I

    invoke-static {v0, v1, v2}, Lo6/r;->h(Lo6/r;Lh6/p;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
