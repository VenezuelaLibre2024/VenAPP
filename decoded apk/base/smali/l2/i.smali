.class public final synthetic Ll2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ll2/k;


# direct methods
.method public synthetic constructor <init>(Ll2/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll2/i;->a:Ll2/k;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll2/i;->a:Ll2/k;

    invoke-static {v0}, Ll2/k;->b(Ll2/k;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
