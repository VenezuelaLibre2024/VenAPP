.class public final synthetic Lwc/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lwc/n;

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lwc/n;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwc/l;->a:Lwc/n;

    iput-object p2, p0, Lwc/l;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lwc/l;->a:Lwc/n;

    iget-object v1, p0, Lwc/l;->b:Ljava/util/List;

    invoke-static {v0, v1}, Lwc/n;->b(Lwc/n;Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
