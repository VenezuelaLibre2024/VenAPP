.class public final Lh0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh0/c$a;
    }
.end annotation


# instance fields
.field private final a:Lh0/a;

.field private final b:Lh0/d;

.field private final c:I


# direct methods
.method constructor <init>(Lh0/a;Lh0/d;Lh0/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/c;->a:Lh0/a;

    iput-object p2, p0, Lh0/c;->b:Lh0/d;

    iput p4, p0, Lh0/c;->c:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lh0/c;->c:I

    return v0
.end method

.method public b()Lh0/a;
    .locals 1

    iget-object v0, p0, Lh0/c;->a:Lh0/a;

    return-object v0
.end method

.method public c()Lh0/b;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public d()Lh0/d;
    .locals 1

    iget-object v0, p0, Lh0/c;->b:Lh0/d;

    return-object v0
.end method
