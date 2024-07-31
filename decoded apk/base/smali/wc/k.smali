.class public final synthetic Lwc/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lwc/n;


# direct methods
.method public synthetic constructor <init>(Lwc/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwc/k;->a:Lwc/n;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwc/k;->a:Lwc/n;

    invoke-static {v0}, Lwc/n;->a(Lwc/n;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
