.class public final synthetic Lo6/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/b$a;


# instance fields
.field public final synthetic a:Lo6/r;

.field public final synthetic b:Ljava/lang/Iterable;

.field public final synthetic c:Lh6/p;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lo6/r;Ljava/lang/Iterable;Lh6/p;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/m;->a:Lo6/r;

    iput-object p2, p0, Lo6/m;->b:Ljava/lang/Iterable;

    iput-object p3, p0, Lo6/m;->c:Lh6/p;

    iput-wide p4, p0, Lo6/m;->d:J

    return-void
.end method


# virtual methods
.method public final n()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lo6/m;->a:Lo6/r;

    iget-object v1, p0, Lo6/m;->b:Ljava/lang/Iterable;

    iget-object v2, p0, Lo6/m;->c:Lh6/p;

    iget-wide v3, p0, Lo6/m;->d:J

    invoke-static {v0, v1, v2, v3, v4}, Lo6/r;->e(Lo6/r;Ljava/lang/Iterable;Lh6/p;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
