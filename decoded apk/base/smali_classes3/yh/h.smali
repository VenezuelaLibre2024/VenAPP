.class public final synthetic Lyh/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lyh/i;


# direct methods
.method public synthetic constructor <init>(Lyh/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyh/h;->a:Lyh/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lyh/h;->a:Lyh/i;

    invoke-static {v0}, Lyh/i;->d(Lyh/i;)V

    return-void
.end method
