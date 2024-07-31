.class public final synthetic Lk7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lk7/g;


# direct methods
.method public synthetic constructor <init>(Lk7/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk7/f;->a:Lk7/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lk7/f;->a:Lk7/g;

    invoke-static {v0}, Lk7/g;->a(Lk7/g;)V

    return-void
.end method
