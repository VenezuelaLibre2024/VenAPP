.class public final synthetic Lo6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/b$a;


# instance fields
.field public final synthetic a:Lp6/d;


# direct methods
.method public synthetic constructor <init>(Lp6/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/i;->a:Lp6/d;

    return-void
.end method


# virtual methods
.method public final n()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo6/i;->a:Lp6/d;

    invoke-interface {v0}, Lp6/d;->u()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method