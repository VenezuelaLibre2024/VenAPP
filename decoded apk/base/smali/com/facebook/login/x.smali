.class public final synthetic Lcom/facebook/login/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/b;


# instance fields
.field public final synthetic a:Lok/l;


# direct methods
.method public synthetic constructor <init>(Lok/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/login/x;->a:Lok/l;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/x;->a:Lok/l;

    check-cast p1, Landroidx/activity/result/a;

    invoke-static {v0, p1}, Lcom/facebook/login/y;->e(Lok/l;Landroidx/activity/result/a;)V

    return-void
.end method
