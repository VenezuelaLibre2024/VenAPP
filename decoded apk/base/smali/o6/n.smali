.class public final synthetic Lo6/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/b$a;


# instance fields
.field public final synthetic a:Lo6/r;

.field public final synthetic b:Ljava/lang/Iterable;


# direct methods
.method public synthetic constructor <init>(Lo6/r;Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/n;->a:Lo6/r;

    iput-object p2, p0, Lo6/n;->b:Ljava/lang/Iterable;

    return-void
.end method


# virtual methods
.method public final n()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lo6/n;->a:Lo6/r;

    iget-object v1, p0, Lo6/n;->b:Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lo6/r;->g(Lo6/r;Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
