.class public Lih/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldg/t;


# instance fields
.field private a:Lih/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ldg/s;)V
    .locals 1

    iget-object v0, p0, Lih/h;->a:Lih/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lih/f;->a(Ldg/s;)V

    :cond_0
    return-void
.end method

.method public b(Lih/f;)V
    .locals 0

    iput-object p1, p0, Lih/h;->a:Lih/f;

    return-void
.end method
