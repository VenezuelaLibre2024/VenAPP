.class public final synthetic Lo6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/b$a;


# instance fields
.field public final synthetic a:Lo6/r;

.field public final synthetic b:Lh6/p;


# direct methods
.method public synthetic constructor <init>(Lo6/r;Lh6/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/k;->a:Lo6/r;

    iput-object p2, p0, Lo6/k;->b:Lh6/p;

    return-void
.end method


# virtual methods
.method public final n()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lo6/k;->a:Lo6/r;

    iget-object v1, p0, Lo6/k;->b:Lh6/p;

    invoke-static {v0, v1}, Lo6/r;->b(Lo6/r;Lh6/p;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
