.class public final synthetic Lyh/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lyh/i;

.field public final synthetic b:Lai/e;


# direct methods
.method public synthetic constructor <init>(Lyh/i;Lai/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyh/g;->a:Lyh/i;

    iput-object p2, p0, Lyh/g;->b:Lai/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lyh/g;->a:Lyh/i;

    iget-object v1, p0, Lyh/g;->b:Lai/e;

    invoke-static {v0, v1}, Lyh/i;->f(Lyh/i;Lai/e;)V

    return-void
.end method
