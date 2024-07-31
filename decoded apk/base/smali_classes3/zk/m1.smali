.class public abstract Lzk/m1;
.super Lzk/h0;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzk/m1$a;
    }
.end annotation


# static fields
.field public static final c:Lzk/m1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzk/m1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzk/m1$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lzk/m1;->c:Lzk/m1$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lzk/h0;-><init>()V

    return-void
.end method
