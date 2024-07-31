.class public final synthetic Li5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Li5/e;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Li5/e;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li5/d;->a:Li5/e;

    iput-object p2, p0, Li5/d;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Li5/d;->a:Li5/e;

    iget-object v1, p0, Li5/d;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Li5/e;->e(Li5/e;Landroid/content/Context;)V

    return-void
.end method
