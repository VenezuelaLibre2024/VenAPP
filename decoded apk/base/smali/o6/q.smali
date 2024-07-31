.class public final synthetic Lo6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/b$a;


# instance fields
.field public final synthetic a:Lo6/r;

.field public final synthetic b:Lh6/p;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lo6/r;Lh6/p;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/q;->a:Lo6/r;

    iput-object p2, p0, Lo6/q;->b:Lh6/p;

    iput-wide p3, p0, Lo6/q;->c:J

    return-void
.end method


# virtual methods
.method public final n()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lo6/q;->a:Lo6/r;

    iget-object v1, p0, Lo6/q;->b:Lh6/p;

    iget-wide v2, p0, Lo6/q;->c:J

    invoke-static {v0, v1, v2, v3}, Lo6/r;->f(Lo6/r;Lh6/p;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
