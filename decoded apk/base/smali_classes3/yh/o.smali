.class public final synthetic Lyh/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lyh/p;

.field public final synthetic b:Lyh/m;


# direct methods
.method public synthetic constructor <init>(Lyh/p;Lyh/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyh/o;->a:Lyh/p;

    iput-object p2, p0, Lyh/o;->b:Lyh/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lyh/o;->a:Lyh/p;

    iget-object v1, p0, Lyh/o;->b:Lyh/m;

    invoke-static {v0, v1}, Lyh/p;->e(Lyh/p;Lyh/m;)V

    return-void
.end method
