.class public final synthetic Lcom/facebook/appevents/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/facebook/appevents/e0;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/appevents/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/appevents/j;->a:Lcom/facebook/appevents/e0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/appevents/j;->a:Lcom/facebook/appevents/e0;

    invoke-static {v0}, Lcom/facebook/appevents/m;->e(Lcom/facebook/appevents/e0;)V

    return-void
.end method
