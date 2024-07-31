.class public final synthetic Ls4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/facebook/appevents/d;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/facebook/appevents/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls4/a;->a:Ljava/lang/String;

    iput-object p2, p0, Ls4/a;->b:Lcom/facebook/appevents/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ls4/a;->a:Ljava/lang/String;

    iget-object v1, p0, Ls4/a;->b:Lcom/facebook/appevents/d;

    invoke-static {v0, v1}, Ls4/c;->b(Ljava/lang/String;Lcom/facebook/appevents/d;)V

    return-void
.end method
