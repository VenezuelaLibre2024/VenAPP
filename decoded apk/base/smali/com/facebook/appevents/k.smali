.class public final synthetic Lcom/facebook/appevents/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/facebook/appevents/a;

.field public final synthetic b:Lcom/facebook/appevents/j0;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/appevents/a;Lcom/facebook/appevents/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/appevents/k;->a:Lcom/facebook/appevents/a;

    iput-object p2, p0, Lcom/facebook/appevents/k;->b:Lcom/facebook/appevents/j0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/appevents/k;->a:Lcom/facebook/appevents/a;

    iget-object v1, p0, Lcom/facebook/appevents/k;->b:Lcom/facebook/appevents/j0;

    invoke-static {v0, v1}, Lcom/facebook/appevents/m;->f(Lcom/facebook/appevents/a;Lcom/facebook/appevents/j0;)V

    return-void
.end method
