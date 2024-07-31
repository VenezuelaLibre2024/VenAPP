.class public final Lzk/w1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgk/f$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzk/w1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lgk/f$c<",
        "Lzk/w1;",
        ">;"
    }
.end annotation


# static fields
.field static final synthetic a:Lzk/w1$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzk/w1$b;

    invoke-direct {v0}, Lzk/w1$b;-><init>()V

    sput-object v0, Lzk/w1$b;->a:Lzk/w1$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
