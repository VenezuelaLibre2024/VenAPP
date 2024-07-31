.class public final synthetic Lwc/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lwc/n$a;


# direct methods
.method public synthetic constructor <init>(Lwc/n$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwc/m;->a:Lwc/n$a;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwc/m;->a:Lwc/n$a;

    invoke-static {v0}, Lwc/n$a;->a(Lwc/n$a;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
