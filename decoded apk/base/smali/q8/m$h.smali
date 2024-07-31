.class abstract Lq8/m$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq8/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq8/m$h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lq8/m$h<",
        "TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Lv7/d1;

.field public final c:I

.field public final d:Lt6/u1;


# direct methods
.method public constructor <init>(ILv7/d1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lq8/m$h;->a:I

    iput-object p2, p0, Lq8/m$h;->b:Lv7/d1;

    iput p3, p0, Lq8/m$h;->c:I

    invoke-virtual {p2, p3}, Lv7/d1;->d(I)Lt6/u1;

    move-result-object p1

    iput-object p1, p0, Lq8/m$h;->d:Lt6/u1;

    return-void
.end method


# virtual methods
.method public abstract b()I
.end method

.method public abstract h(Lq8/m$h;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation
.end method
