.class public final synthetic Lcom/facebook/login/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/facebook/login/m;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/login/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/login/f;->a:Lcom/facebook/login/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/f;->a:Lcom/facebook/login/m;

    invoke-static {v0}, Lcom/facebook/login/m;->w(Lcom/facebook/login/m;)V

    return-void
.end method
